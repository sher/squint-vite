import * as squint_core from 'squint-cljs/core.js';
import * as App from './App.jsx';
import * as rdom from 'react-dom/client';
var root = rdom.createRoot(document.getElementById("root"));
root.render(<App.App></App.App>);

export { root }
