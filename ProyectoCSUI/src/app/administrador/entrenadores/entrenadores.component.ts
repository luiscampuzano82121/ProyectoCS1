import { Component, OnInit } from '@angular/core';
import {DataService} from "../../data.service";
import {Entrenador} from "../../../models/Entrenador";

@Component({
  selector: 'app-entrenadores',
  templateUrl: './entrenadores.component.html',
  styleUrls: ['./entrenadores.component.css']
})
export class EntrenadoresComponent implements OnInit {
  entrenadores: Entrenador[];
  constructor(private dataService: DataService) { }

  ngOnInit() {
    this.dataService.getEntrenadores().subscribe(data => this.entrenadores = data);
  }

}

