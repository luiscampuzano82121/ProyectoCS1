import { Component, OnInit } from '@angular/core';
import {DataService} from '../data.service';

@Component({
  selector: 'app-sign-in',
  templateUrl: './sign-in.component.html',
  styleUrls: ['./sign-in.component.css']
})
export class SignInComponent implements OnInit {
  login = ''
  password = ''
  constructor(private dataService: DataService) { }

  ngOnInit() {
  }
  signIn() {
    console.log(this.login);
  }
}
