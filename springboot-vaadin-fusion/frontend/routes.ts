import { Route } from '@vaadin/router';
import './views/main-layout';
import './views/persons/persons-view';

export type ViewRoute = Route & { title?: string; children?: ViewRoute[] };

export const views: ViewRoute[] = [
  // place routes below (more info https://vaadin.com/docs/latest/fusion/routing/overview)
  {
    path: '',
    component: 'persons-view',
    title: '',
  },
  {
    path: 'persons',
    component: 'persons-view',
    title: 'Persons',
  },
  {
    path: 'map',
    component: 'map-view',
    title: 'Map',
    action: async () => {
      await import('./views/map/map-view');
    },
  },
];
export const routes: ViewRoute[] = [
  {
    path: '',
    component: 'main-layout',
    children: [...views],
  },
];
