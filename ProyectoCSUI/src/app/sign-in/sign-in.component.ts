import { Component, OnInit } from '@angular/core';
import {DataService} from '../data.service';
import {ActivatedRoute, Router} from '@angular/router';
import {el} from '@angular/platform-browser/testing/src/browser_util';

@Component({
  selector: 'app-sign-in',
  templateUrl: './sign-in.component.html',
  styleUrls: ['./sign-in.component.css']
})
export class SignInComponent implements OnInit {
  login = 'admin';
  password = '123456';
  constructor(private dataService: DataService, private activatedRoute: ActivatedRoute, private router: Router) { }

  ngOnInit() {
  }
  signIn() {
    this.dataService.iniciarSesion(this.login, this.password).subscribe(
      data => { this.validateRole(data.valueOf());
      });
    // quitar esta linea cuando ya funcione el sigin con el servicio
    this.router.navigate(['/administrador'], { relativeTo: this.activatedRoute });
  }

  validateRole(role: string) {
    if (role === 'administrador') {
      this.router.navigate(['/administrador'], { relativeTo: this.activatedRoute });
    }
    if (role === 'entrenador') {
      this.router.navigate(['/entrenador'], { relativeTo: this.activatedRoute });
    }
    console.log(role);
  }
}
