package com.snappiet.immutables.generics.bug;

import java.util.List;

import org.immutables.value.Value;

@Value.Immutable
public interface Bar {
  List<ImmutableFoo<String>> getFoos();
}
