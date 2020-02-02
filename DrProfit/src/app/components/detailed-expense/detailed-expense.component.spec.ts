import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DetailedExpenseComponent } from './detailed-expense.component';

describe('DetailedExpenseComponent', () => {
  let component: DetailedExpenseComponent;
  let fixture: ComponentFixture<DetailedExpenseComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DetailedExpenseComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DetailedExpenseComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
