import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DeportesEntrenadorComponent } from './deportes-entrenador.component';

describe('DeportesEntrenadorComponent', () => {
  let component: DeportesEntrenadorComponent;
  let fixture: ComponentFixture<DeportesEntrenadorComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DeportesEntrenadorComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DeportesEntrenadorComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
