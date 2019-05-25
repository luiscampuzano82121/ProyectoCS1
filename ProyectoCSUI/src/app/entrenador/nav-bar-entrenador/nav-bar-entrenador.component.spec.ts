import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { NavBarEntrenadorComponent } from './nav-bar-entrenador.component';

describe('NavBarEntrenadorComponent', () => {
  let component: NavBarEntrenadorComponent;
  let fixture: ComponentFixture<NavBarEntrenadorComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ NavBarEntrenadorComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(NavBarEntrenadorComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
