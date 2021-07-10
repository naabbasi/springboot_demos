import { Route } from '@vaadin/router';
import './views/main-layout';
import './views/users/users-view';
import './views/dashbaord/dashboard-view';

export type ViewRoute = Route & { title?: string; children?: ViewRoute[] };

export const views: ViewRoute[] = [
  // place routes below (more info https://vaadin.com/docs/latest/fusion/routing/overview)
  {
    path: '',
    component: 'dashboard-view',
    title: 'Dashboard',
  },
  {
    path: 'users',
    component: 'users-view',
    title: 'Users',
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
