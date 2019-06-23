import { Component, OnInit } from '@angular/core';
import {DataService} from '../../data.service';
import {Entrenador} from '../../../models/Entrenador';
import * as jsPDF from 'jspdf';
import {EntrenadorEnviar} from '../../../models/EntrenadorEnviar';
import {ExcelService} from '../../services/excel.service';

@Component({
  selector: 'app-entrenadores',
  templateUrl: './entrenadores.component.html',
  styleUrls: ['./entrenadores.component.css']
})
export class EntrenadoresComponent implements OnInit {
  entrenadores: Entrenador[];
  entrenadorToCreate: EntrenadorEnviar;
  constructor(private dataService: DataService, private excelService: ExcelService) { }

  downloadPdf() {
    var doc = new jsPDF();
    var positiony = 20;
    doc.text(20, 20, 'Lista de entrenadores');
    positiony = positiony + 10;
    doc.text(20, 20, '');
    positiony = positiony + 10;
    for (const entrenador of this.entrenadores) {
      doc.text(20, positiony, 'Estudiante: ' + entrenador.Nombre);
      positiony = positiony + 10;
      doc.text(20, positiony, 'Codigo entrenador: ' + entrenador.CodigoEntrenador);
      positiony = positiony + 10;
      doc.text(20, positiony, 'Cedula: ' + entrenador.Cedula);
      positiony = positiony + 10;
      doc.text(20, positiony, 'Direccion: ' + entrenador.Direccion);
      positiony = positiony + 10;
      doc.text(20, positiony, 'Nit: ' + entrenador.Nit);
      positiony = positiony + 10;
      doc.text(20, positiony, 'Telefono: ' + entrenador.Telefono);
      positiony = positiony + 10;
      doc.text(20, positiony, 'Calificacion: ' + entrenador.Calificacion);
      positiony = positiony + 10;
      doc.text(20, positiony, '');
      positiony = positiony + 10;
    }
    // doc.addPage();
    // Save the PDF
    doc.save('Entrenadores.pdf');
  }

  ngOnInit() {
    this.entrenadorToCreate = new EntrenadorEnviar();
    this.dataService.getEntrenadores().subscribe(data => this.entrenadores = data);
  }

  createEntrenador() {
    this.dataService.createEntrenador(this.entrenadorToCreate);
  }

  exportAsXLSX(): void {
    this.excelService.exportAsExcelFile(this.entrenadores, 'Entrenadores');
  }
}

