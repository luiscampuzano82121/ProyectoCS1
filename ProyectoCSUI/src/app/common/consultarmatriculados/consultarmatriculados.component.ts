import { Component, OnInit } from '@angular/core';
import {DataService} from '../../data.service';
import {Estudiante} from '../../../models/Estudiante';

@Component({
  selector: 'app-consultarmatriculados',
  templateUrl: './consultarmatriculados.component.html',
  styleUrls: ['./consultarmatriculados.component.css']
})
export class ConsultarmatriculadosComponent implements OnInit {

  constructor(private dataService: DataService) { }
  estudiantes: Estudiante[];
  ngOnInit() {
    this.getEstudiantes();
  }

  getEstudiantes() {
    this.dataService.getEstudiantes().subscribe(data => this.estudiantes = data);
  }
}
