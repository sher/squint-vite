import * as squint_core from 'squint-cljs/core.js';
import { useState } from 'react';
var App = (function () {
return <div>{(function () {
 let vec__14 = useState(0);
let state5 = squint_core.nth(vec__14, 0, null);
let setState6 = squint_core.nth(vec__14, 1, null);
return <div>You clicked  {state5} times! <button onClick={(function (p__1) {
let vec__710 = p__1;
let _11 = squint_core.nth(vec__710, 0, null);
let _12 = squint_core.nth(vec__710, 1, null);
let _13 = squint_core.nth(vec__710, 2, null);
return setState6((state5 + 1));
})}>Click me!</button></div>;
})()}</div>;
});

export { App }
