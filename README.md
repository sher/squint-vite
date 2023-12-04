<img width="628" src="https://github.com/sher/squint-vite/assets/381501/75b662c0-11a7-4c1a-a2bc-bf4d44077cab">

# Squint + React + Vite

This template provides a minimal setup to get Squint compiling to React working in Vite with HMR.

## Dependencies
- [babashka](https://babashka.org/) is used for task running (ref: [bb.edn](bb.edn))

## Development
```sh
$ bb dev
```
What this command does is:
- compiles every `.cljs` file inside `src-cljs` to `.jsx` and outputs it into `src` folder
- copies all other files in `src-cljs` to `src` folder keeping the directory structure
- starts _squint watch_ and _vite dev_ processes with HMR, piping their stdio

For configuration options, refer to [squint.edn](squint.edn).

## Production build
```sh
$ bb build
```
