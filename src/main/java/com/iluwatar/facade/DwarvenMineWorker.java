/**
 * The MIT License
 * Copyright (c) 2014-2016 Ilkka Seppälä
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.iluwatar.facade;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;


public abstract class DwarvenMineWorker {

  private String goToSleep() {
    return String.format("%s goes to sleep", name());
  }

  private String wakeUp() {
    return String.format("%s wakes up", name());
  }

  private String goHome() {
    return String.format("%s goes home", name());
  }

  private String goToMine() {
    return String.format("%s goes to mine", name());
  }

  private String performAction(Action action) {
    switch (action) {
      case GO_TO_SLEEP:
        return goToSleep();
      case WAKE_UP:
        return wakeUp();
      case GO_HOME:
        return goHome();
      case GO_TO_MINE:
        return goToMine();
      case WORK:
        return work();
      default:
        throw new IllegalArgumentException("Dwarf exploded");
    }
  }

  List<String> performAction(Action... actions) {
    return Arrays.stream(actions)
            .map(this::performAction)
            .collect(toList());
  }

  public abstract String work();

  public abstract String name();
}
