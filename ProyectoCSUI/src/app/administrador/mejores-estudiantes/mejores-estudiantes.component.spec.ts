import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { MejoresEstudiantesComponent } from './mejores-estudiantes.component';

describe('MejoresEstudiantesComponent', () => {
  let component: MejoresEstudiantesComponent;
  let fixture: ComponentFixture<MejoresEstudiantesComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MejoresEstudiantesComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MejoresEstudiantesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
