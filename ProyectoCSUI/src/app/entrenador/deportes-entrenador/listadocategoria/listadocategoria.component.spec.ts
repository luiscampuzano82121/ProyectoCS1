import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ListadocategoriaComponent } from './listadocategoria.component';

describe('ListadocategoriaComponent', () => {
  let component: ListadocategoriaComponent;
  let fixture: ComponentFixture<ListadocategoriaComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ListadocategoriaComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ListadocategoriaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
