import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Ex15HomeComponent } from './ex-15-home.component';

describe('Ex15HomeComponent', () => {
  let component: Ex15HomeComponent;
  let fixture: ComponentFixture<Ex15HomeComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Ex15HomeComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Ex15HomeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
