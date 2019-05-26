import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DeportesAdministradorComponent } from './deportes-administrador.component';

describe('DeportesAdministradorComponent', () => {
  let component: DeportesAdministradorComponent;
  let fixture: ComponentFixture<DeportesAdministradorComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DeportesAdministradorComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DeportesAdministradorComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
