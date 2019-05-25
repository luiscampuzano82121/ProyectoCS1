import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ConsultarmatriculadosComponent } from './consultarmatriculados.component';

describe('ConsultarmatriculadosComponent', () => {
  let component: ConsultarmatriculadosComponent;
  let fixture: ComponentFixture<ConsultarmatriculadosComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ConsultarmatriculadosComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ConsultarmatriculadosComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
