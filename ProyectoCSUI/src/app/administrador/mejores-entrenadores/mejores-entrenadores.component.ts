import { Component, OnInit } from '@angular/core';
import {DataService} from '../../data.service';
import {Entrenador} from '../../../models/Entrenador';

@Component({
  selector: 'app-mejores-entrenadores',
  templateUrl: './mejores-entrenadores.component.html',
  styleUrls: ['./mejores-entrenadores.component.css']
})
export class MejoresEntrenadoresComponent implements OnInit {

  constructor(private dataService: DataService) { }
  entrenadores: Entrenador[];
  ngOnInit() {
    this.dataService.getEntrenadores().subscribe(data => this.entrenadores = data);
  }



}
