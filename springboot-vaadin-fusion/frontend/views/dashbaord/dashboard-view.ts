import {View} from "Frontend/views/view";
import {customElement, html} from "lit-element";

@customElement("dashboard-view")
export class DashboardView extends View {
    protected render() {
        return html`
            <vaadin-split-layout class="w-full h-full">
                <div class="flex-grow w-full">
                    <h2>Noman Ali Abbasi</h2>
                </div>
            </vaadin-split-layout>
        `
    }
}
