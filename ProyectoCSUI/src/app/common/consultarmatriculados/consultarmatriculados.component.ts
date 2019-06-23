import { Component, OnInit } from '@angular/core';
import {DataService} from '../../data.service';
import {Estudiante} from '../../../models/Estudiante';
import * as jsPDF from 'jspdf';
import {ExcelService} from '../../services/excel.service';
@Component({
  selector: 'app-consultarmatriculados',
  templateUrl: './consultarmatriculados.component.html',
  styleUrls: ['./consultarmatriculados.component.css']
})
export class ConsultarmatriculadosComponent implements OnInit {

  constructor(private dataService: DataService, private excelService: ExcelService) { }
  estudiantes: Estudiante[];

  ngOnInit() {
    this.estudiantes = [];
    this.getEstudiantes();

  }

  downloadPdf() {
    var doc = new jsPDF();
    var positiony = 20;
    doc.text(20, 20, 'Lista de estudiantes matriculados');
    positiony = positiony + 10;
    doc.text(20, 20, '');
    positiony = positiony + 10;
    for (const estudiante of this.estudiantes) {
      doc.text(20, positiony, 'Estudiante ' + estudiante.Nombre);
      positiony = positiony + 10;
      doc.text(20, positiony, 'Codigo: ' + estudiante.CodigoEntrenador);
      positiony = positiony + 10;
      doc.text(20, positiony, 'Cedula: ' + estudiante.Cedula);
      positiony = positiony + 10;
      doc.text(20, positiony, 'Direccion: ' + estudiante.Direccion);
      positiony = positiony + 10;
      doc.text(20, positiony, 'Telefono: ' + estudiante.telefono);
      positiony = positiony + 10;
      doc.text(20, positiony, 'Estado: ' + estudiante.Estado);
      positiony = positiony + 10;
      doc.text(20, positiony, 'Calificacion ' + estudiante.Calificacion);
      positiony = positiony + 10;
      doc.text(20, positiony, '');
      positiony = positiony + 10;
    }
    // doc.addPage();
    // Save the PDF
    doc.save('EstudiantesMatriculados.pdf');
  }

  getEstudiantes() {
    this.dataService.getEstudiantes().subscribe(data => this.estudiantes = data);
  }

  exportAsXLSX(): void {
    this.excelService.exportAsExcelFile(this.estudiantes, 'Entrenadores');
  }
}
