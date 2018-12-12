import { TestBed } from '@angular/core/testing';

import { ItemService } from './issue.service';

describe('IssueService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: ItemService = TestBed.get(ItemService);
    expect(service).toBeTruthy();
  });
});
