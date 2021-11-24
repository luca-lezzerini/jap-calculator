import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  first = 0;
  second = 0;
  result = 0;

  sum() {
    this.result = this.first + this.second;
  }
}
