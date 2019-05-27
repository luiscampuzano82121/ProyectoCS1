import { Component, OnInit } from '@angular/core';
import {DataService} from '../../data.service';
import {Estudiante} from '../../../models/Estudiante';

@Component({
  selector: 'app-mejores-estudiantes',
  templateUrl: './mejores-estudiantes.component.html',
  styleUrls: ['./mejores-estudiantes.component.css']
})
export class MejoresEstudiantesComponent implements OnInit {

  constructor(private dataService: DataService) { }
  estudiantes: Estudiante[];
  ngOnInit() {
    this.getEstudiantes();
  }

  getEstudiantes() {
    this.dataService.getEstudiantes().subscribe(data => this.estudiantes = data);
  }

}
