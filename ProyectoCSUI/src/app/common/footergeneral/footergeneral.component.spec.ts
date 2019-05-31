import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { FootergeneralComponent } from './footergeneral.component';

describe('FootergeneralComponent', () => {
  let component: FootergeneralComponent;
  let fixture: ComponentFixture<FootergeneralComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ FootergeneralComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(FootergeneralComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
