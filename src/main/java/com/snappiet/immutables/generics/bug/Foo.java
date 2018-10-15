package com.snappiet.immutables.generics.bug;

import org.immutables.value.Value;

@Value.Immutable
public interface Foo<T> {
  T getThing();
}
