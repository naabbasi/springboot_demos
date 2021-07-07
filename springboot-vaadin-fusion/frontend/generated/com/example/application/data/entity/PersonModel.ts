// @ts-nocheck

import AbstractEntityModel from '../AbstractEntityModel';
import Person from './Person';

import {ObjectModel,StringModel,NumberModel,ArrayModel,BooleanModel,Required,ModelType,_getPropertyModel} from '@vaadin/form';

import {Email,Null,NotNull,NotEmpty,NotBlank,AssertTrue,AssertFalse,Negative,NegativeOrZero,Positive,PositiveOrZero,Size,Past,Future,Digits,Min,Max,Pattern,DecimalMin,DecimalMax} from '@vaadin/form';

/**
 * This module is generated from com.example.application.data.entity.Person.
 * All changes to this file are overridden. Please consider to make changes in the corresponding Java file if necessary.
 * @see {@link file://E:\Learning\spring-boot\springboot_demos\springboot-vaadin-fusion\src\main\java\com\example\application\data\entity\Person.java}
 */
export default class PersonModel<T extends Person = Person> extends AbstractEntityModel<T> {
  static createEmptyValue: () => Person;

  get dob(): StringModel {
    return this[_getPropertyModel]('dob', StringModel, [true]);
  }

  get firstName(): StringModel {
    return this[_getPropertyModel]('firstName', StringModel, [false]);
  }

  get lastName(): StringModel {
    return this[_getPropertyModel]('lastName', StringModel, [false]);
  }
}
