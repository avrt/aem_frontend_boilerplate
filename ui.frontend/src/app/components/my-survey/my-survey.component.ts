import { Component, Input, OnInit } from '@angular/core';
import {MapTo} from '@adobe/aem-angular-editable-components';

const MySurveyEditConfig = {
  emptyLabel: 'MySurvey',
  isEmpty: cqModel =>
      !cqModel || !cqModel.question || cqModel.question.trim().length < 1
  };

@Component({
  selector: 'app-my-survey',
  templateUrl: './my-survey.component.html',
  styleUrls: ['./my-survey.component.css']
})
export class MySurveyComponent implements OnInit {

  @Input() question: string;
  @Input() opt1: string;
  @Input() opt2: string;

  constructor() { }

  ngOnInit() {
  }

  get hasQuestion() {
    return this.question && this.question.trim().length > 0;
  }

}

MapTo('csurvey/components/my-survey')(MySurveyComponent, MySurveyEditConfig);

