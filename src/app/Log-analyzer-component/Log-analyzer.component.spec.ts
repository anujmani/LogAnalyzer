import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SortByDateAndTimeComponent } from './Log-analyzer.component';

describe('SortByDateAndTimeComponent', () => {
  let component: SortByDateAndTimeComponent;
  let fixture: ComponentFixture<SortByDateAndTimeComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [SortByDateAndTimeComponent]
    });
    fixture = TestBed.createComponent(SortByDateAndTimeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
