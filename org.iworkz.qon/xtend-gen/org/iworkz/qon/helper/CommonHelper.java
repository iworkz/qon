package org.iworkz.qon.helper;

import com.google.common.base.Objects;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

@SuppressWarnings("all")
public class CommonHelper {
  public <T extends Object> Iterable<T> nullSafeIterable(final Iterable<T> iterable) {
    boolean _equals = Objects.equal(iterable, null);
    if (_equals) {
      return CollectionLiterals.<T>emptySet();
    } else {
      return iterable;
    }
  }
}
