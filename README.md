# capability-render-galactic-frame

Atomic authority package for `render/galactic-frame`.

- imports: `#{:galactic-frame?}`
- effects: `#{:user-interface-read}`
- default policy: `:autonomous`
- provider status: `contract-only`

Importing this package does not grant runtime authority. Tamaki must
request it explicitly and Kototama must admit the sealed envelope.

```sh
clojure -M:test
```
