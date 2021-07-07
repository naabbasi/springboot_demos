// @ts-nocheck

import GridSorter from './GridSorter';

import {ObjectModel,StringModel,NumberModel,ArrayModel,BooleanModel,Required,ModelType,_getPropertyModel} from '@vaadin/form';

import {Email,Null,NotNull,NotEmpty,NotBlank,AssertTrue,AssertFalse,Negative,NegativeOrZero,Positive,PositiveOrZero,Size,Past,Future,Digits,Min,Max,Pattern,DecimalMin,DecimalMax} from '@vaadin/form';

/**
 * This module is generated from org.vaadin.artur.helpers.GridSorter.
 * All changes to this file are overridden. Please consider to make changes in the corresponding Java file if necessary.
 */
export default class GridSorterModel<T extends GridSorter = GridSorter> extends ObjectModel<T> { 
  static createEmptyValue: () => GridSorter;

  get direction(): StringModel {
    return this[_getPropertyModel]('direction', StringModel, [true]);
  }

  get path(): StringModel {
    return this[_getPropertyModel]('path', StringModel, [false]);
  }
}
