import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ConditionalcompComponent } from './conditionalcomp.component';

describe('ConditionalcompComponent', () => {
  let component: ConditionalcompComponent;
  let fixture: ComponentFixture<ConditionalcompComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [ConditionalcompComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ConditionalcompComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
