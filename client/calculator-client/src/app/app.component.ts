import { RemoveTaskReqDto } from './remove-task-dtos';
import { AddTaskReqDto } from './add-task-req-dto';
import { RequestDto } from './request-dto';
import { Component } from '@angular/core';
import { Observable } from 'rxjs';
import { ResponseDto } from './response-dto';
import { HttpClient } from '@angular/common/http';
import { TasksRespDto } from './add-task-resp-dto';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  // proeprties for calculator
  first = 0;
  second = 0;
  result = 0;
  // properties for todo list
  task = "";
  tasks: String[] = [];

  constructor(private http: HttpClient) { }

  sum() {
    // this.result = this.first + this.second;
    // prepare data to be sent to the server
    let dto: RequestDto = new RequestDto();
    dto.op1 = this.first;
    dto.op2 = this.second;

    // prepare the POST request (it is ASYNCHROUNOUS!)
    let obs: Observable<ResponseDto> = this.http
      .post<ResponseDto>("http://localhost:8080/sum", dto);

    // subscribe with the callback
    obs.subscribe(r => {
      this.result = r.result;
    }
    );
  }

  addTask() {
    // prepare data to be sent
    let dto = new AddTaskReqDto();
    dto.task = this.task;
    // prepare the request
    let obs: Observable<TasksRespDto> = this.http
      .post<TasksRespDto>("http://localhost:8080/add-task", dto);
    // send the request giving the callback
    obs.subscribe(r => {
      this.tasks = r.tasks;
    });
  }

  deleteTask(i: number) {
    // prepare data to be sent
    let dto = new RemoveTaskReqDto();
    dto.taskIndex = i;
    // prepare the request
    let obs: Observable<TasksRespDto> = this.http
      .post<TasksRespDto>("http://localhost:8080/remove-task", dto);
    // send the request giving the callback
    obs.subscribe(r => {
      this.tasks = r.tasks;
    });
  }
}
