import { __decorate } from "https://unpkg.com/tslib@^1.10.0?module";
/**
 @license
 Copyright 2018 Google Inc. All Rights Reserved.

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */
import { customElement, html, LitElement } from "https://unpkg.com/lit-element@^2.3.0?module";
import { style } from "https://unpkg.com/@material/mwc-icon@0.18.0/mwc-icon-host-css.js?module";
/** @soyCompatible */
let Icon = class Icon extends LitElement {
  /** @soyCompatible */
  render() {
    return html`<slot></slot>`;
  }};

Icon.styles = style;
Icon = __decorate([
    customElement('mwc-icon')],
  Icon);
export { Icon };