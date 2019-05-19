import { Component } from '@angular/core';
import {DataService} from './data.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'ProyectoCSUI';
  constructor( private dataService: DataService) {}
  holamundo() {
    this.dataService.getHello();
  }
}
