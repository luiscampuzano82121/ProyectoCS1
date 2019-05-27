import { Component, OnInit } from '@angular/core';
import {Deporte} from '../../../models/Deporte';
import {DataService} from '../../data.service';
import {DeporteEnviar} from '../../../models/DeporteEnviar';

@Component({
  selector: 'app-deportes-administrador',
  templateUrl: './deportes-administrador.component.html',
  styleUrls: ['./deportes-administrador.component.css']
})
export class DeportesAdministradorComponent implements OnInit {
  deportes: Deporte[];
  deporteToCreate: DeporteEnviar;
  constructor(private dataService: DataService) { }

  ngOnInit() {
    this.deporteToCreate = new DeporteEnviar();
    this.dataService.getDeportes().subscribe(data => this.deportes = data);
  }

  createDeporteEnviar() {
    this.dataService.createDeporte(this.deporteToCreate);
    this.deporteToCreate = new DeporteEnviar();
  }

}
