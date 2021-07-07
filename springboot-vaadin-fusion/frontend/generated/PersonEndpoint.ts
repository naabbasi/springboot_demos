/**
 * This module is generated from PersonEndpoint.java
 * All changes to this file are overridden. Please consider to make changes in the corresponding Java file if necessary.
 * @see {@link file://E:\Learning\spring-boot\springboot_demos\springboot-vaadin-fusion\src\main\java\com\example\application\data\endpoint\PersonEndpoint.java}
 * @module PersonEndpoint
 */

// @ts-ignore
import client from './connect-client.default';
import Person from './com/example/application/data/entity/Person';
import GridSorter from './org/vaadin/artur/helpers/GridSorter';

function _count(): Promise<number> {
 return client.call('PersonEndpoint', 'count');
}
export {_count as count};

function _delete(
 id: number
): Promise<void> {
 return client.call('PersonEndpoint', 'delete', {id});
}
export {_delete as delete};

function _get(
 id: number
): Promise<Person | undefined> {
 return client.call('PersonEndpoint', 'get', {id});
}
export {_get as get};

function _list(
 offset: number,
 limit: number,
 sortOrder: Array<GridSorter>
): Promise<Array<Person>> {
 return client.call('PersonEndpoint', 'list', {offset, limit, sortOrder});
}
export {_list as list};

function _update(
 entity: Person
): Promise<Person> {
 return client.call('PersonEndpoint', 'update', {entity});
}
export {_update as update};

export const PersonEndpoint = Object.freeze({
  count: _count,
  delete: _delete,
  get: _get,
  list: _list,
  update: _update,
});
