/*
 * Copyright (c) Facebook, Inc. and its affiliates.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 */

package com.instagram.common.json.annotation.processor;

import com.facebook.infer.annotation.Nullsafe;

@Nullsafe(Nullsafe.Mode.LOCAL)
public class StringUtil {

  /** We don't want to pull in guava strings just for this one function. */
  /*package*/ static boolean isNullOrEmpty(String string) {
    return string == null || string.isEmpty();
  }
}
