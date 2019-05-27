import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { MejoresEntrenadoresComponent } from './mejores-entrenadores.component';

describe('MejoresEntrenadoresComponent', () => {
  let component: MejoresEntrenadoresComponent;
  let fixture: ComponentFixture<MejoresEntrenadoresComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MejoresEntrenadoresComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MejoresEntrenadoresComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
