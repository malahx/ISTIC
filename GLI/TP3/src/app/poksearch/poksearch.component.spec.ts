import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PoksearchComponent } from './poksearch.component';

describe('PoksearchComponent', () => {
  let component: PoksearchComponent;
  let fixture: ComponentFixture<PoksearchComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PoksearchComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PoksearchComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
