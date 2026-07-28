(ns kotoba.capability.render.galactic-frame
  "Importable contract for render/galactic-frame.")

(def manifest
  {:schema "kotoba.capability.repository.v1", :capability/version 1, :capability/dependencies #{}, :capability/imports #{:galactic-frame?}, :authority "kotoba-lang/kotoba-core-contracts", :capability/default-policy :autonomous, :capability/artifact {:format :wasm-component, :digest-required? true, :signature-required? true}, :capability/radicle-rid nil, :capability/repository "kotoba-lang/capability-render-galactic-frame", :capability/id "render/galactic-frame", :capability/effects #{:user-interface-read}, :capability/provider-status :contract-only})
