// @ts-nocheck

import AbstractEntity from './AbstractEntity';

import {ObjectModel,StringModel,NumberModel,ArrayModel,BooleanModel,Required,ModelType,_getPropertyModel} from '@vaadin/form';

import {Email,Null,NotNull,NotEmpty,NotBlank,AssertTrue,AssertFalse,Negative,NegativeOrZero,Positive,PositiveOrZero,Size,Past,Future,Digits,Min,Max,Pattern,DecimalMin,DecimalMax} from '@vaadin/form';

/**
 * This module is generated from com.example.application.data.AbstractEntity.
 * All changes to this file are overridden. Please consider to make changes in the corresponding Java file if necessary.
 * @see {@link file://E:\Learning\spring-boot\springboot_demos\springboot-vaadin-fusion\src\main\java\com\example\application\data\AbstractEntity.java}
 */
export default class AbstractEntityModel<T extends AbstractEntity = AbstractEntity> extends ObjectModel<T> { 
  static createEmptyValue: () => AbstractEntity;

  get id(): NumberModel {
    return this[_getPropertyModel]('id', NumberModel, [true]);
  }
}
