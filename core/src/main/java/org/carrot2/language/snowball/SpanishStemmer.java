/*
 * Carrot2 project.
 *
 * Copyright (C) 2002-2025, Dawid Weiss, Stanisław Osiński.
 * All rights reserved.
 *
 * Refer to the full license file "carrot2.LICENSE"
 * in the root folder of the repository checkout or at:
 * https://www.carrot2.org/carrot2.LICENSE
 */
package org.carrot2.language.snowball;

/**
 * This class was automatically generated by a Snowball to Java compiler It implements the stemming
 * algorithm defined by a snowball script.
 */
@SuppressWarnings("unused")
public class SpanishStemmer extends SnowballProgram {

  private static final long serialVersionUID = 1L;

  /* patched */ private static final java.lang.invoke.MethodHandles.Lookup methodObject =
      java.lang.invoke.MethodHandles.lookup();

  private static final Among a_0[] = {
    new Among("", -1, 6, "", methodObject),
    new Among("\u00E1", 0, 1, "", methodObject),
    new Among("\u00E9", 0, 2, "", methodObject),
    new Among("\u00ED", 0, 3, "", methodObject),
    new Among("\u00F3", 0, 4, "", methodObject),
    new Among("\u00FA", 0, 5, "", methodObject)
  };

  private static final Among a_1[] = {
    new Among("la", -1, -1, "", methodObject),
    new Among("sela", 0, -1, "", methodObject),
    new Among("le", -1, -1, "", methodObject),
    new Among("me", -1, -1, "", methodObject),
    new Among("se", -1, -1, "", methodObject),
    new Among("lo", -1, -1, "", methodObject),
    new Among("selo", 5, -1, "", methodObject),
    new Among("las", -1, -1, "", methodObject),
    new Among("selas", 7, -1, "", methodObject),
    new Among("les", -1, -1, "", methodObject),
    new Among("los", -1, -1, "", methodObject),
    new Among("selos", 10, -1, "", methodObject),
    new Among("nos", -1, -1, "", methodObject)
  };

  private static final Among a_2[] = {
    new Among("ando", -1, 6, "", methodObject),
    new Among("iendo", -1, 6, "", methodObject),
    new Among("yendo", -1, 7, "", methodObject),
    new Among("\u00E1ndo", -1, 2, "", methodObject),
    new Among("i\u00E9ndo", -1, 1, "", methodObject),
    new Among("ar", -1, 6, "", methodObject),
    new Among("er", -1, 6, "", methodObject),
    new Among("ir", -1, 6, "", methodObject),
    new Among("\u00E1r", -1, 3, "", methodObject),
    new Among("\u00E9r", -1, 4, "", methodObject),
    new Among("\u00EDr", -1, 5, "", methodObject)
  };

  private static final Among a_3[] = {
    new Among("ic", -1, -1, "", methodObject),
    new Among("ad", -1, -1, "", methodObject),
    new Among("os", -1, -1, "", methodObject),
    new Among("iv", -1, 1, "", methodObject)
  };

  private static final Among a_4[] = {
    new Among("able", -1, 1, "", methodObject),
    new Among("ible", -1, 1, "", methodObject),
    new Among("ante", -1, 1, "", methodObject)
  };

  private static final Among a_5[] = {
    new Among("ic", -1, 1, "", methodObject),
    new Among("abil", -1, 1, "", methodObject),
    new Among("iv", -1, 1, "", methodObject)
  };

  private static final Among a_6[] = {
    new Among("ica", -1, 1, "", methodObject),
    new Among("ancia", -1, 2, "", methodObject),
    new Among("encia", -1, 5, "", methodObject),
    new Among("adora", -1, 2, "", methodObject),
    new Among("osa", -1, 1, "", methodObject),
    new Among("ista", -1, 1, "", methodObject),
    new Among("iva", -1, 9, "", methodObject),
    new Among("anza", -1, 1, "", methodObject),
    new Among("log\u00EDa", -1, 3, "", methodObject),
    new Among("idad", -1, 8, "", methodObject),
    new Among("able", -1, 1, "", methodObject),
    new Among("ible", -1, 1, "", methodObject),
    new Among("ante", -1, 2, "", methodObject),
    new Among("mente", -1, 7, "", methodObject),
    new Among("amente", 13, 6, "", methodObject),
    new Among("aci\u00F3n", -1, 2, "", methodObject),
    new Among("uci\u00F3n", -1, 4, "", methodObject),
    new Among("ico", -1, 1, "", methodObject),
    new Among("ismo", -1, 1, "", methodObject),
    new Among("oso", -1, 1, "", methodObject),
    new Among("amiento", -1, 1, "", methodObject),
    new Among("imiento", -1, 1, "", methodObject),
    new Among("ivo", -1, 9, "", methodObject),
    new Among("ador", -1, 2, "", methodObject),
    new Among("icas", -1, 1, "", methodObject),
    new Among("ancias", -1, 2, "", methodObject),
    new Among("encias", -1, 5, "", methodObject),
    new Among("adoras", -1, 2, "", methodObject),
    new Among("osas", -1, 1, "", methodObject),
    new Among("istas", -1, 1, "", methodObject),
    new Among("ivas", -1, 9, "", methodObject),
    new Among("anzas", -1, 1, "", methodObject),
    new Among("log\u00EDas", -1, 3, "", methodObject),
    new Among("idades", -1, 8, "", methodObject),
    new Among("ables", -1, 1, "", methodObject),
    new Among("ibles", -1, 1, "", methodObject),
    new Among("aciones", -1, 2, "", methodObject),
    new Among("uciones", -1, 4, "", methodObject),
    new Among("adores", -1, 2, "", methodObject),
    new Among("antes", -1, 2, "", methodObject),
    new Among("icos", -1, 1, "", methodObject),
    new Among("ismos", -1, 1, "", methodObject),
    new Among("osos", -1, 1, "", methodObject),
    new Among("amientos", -1, 1, "", methodObject),
    new Among("imientos", -1, 1, "", methodObject),
    new Among("ivos", -1, 9, "", methodObject)
  };

  private static final Among a_7[] = {
    new Among("ya", -1, 1, "", methodObject),
    new Among("ye", -1, 1, "", methodObject),
    new Among("yan", -1, 1, "", methodObject),
    new Among("yen", -1, 1, "", methodObject),
    new Among("yeron", -1, 1, "", methodObject),
    new Among("yendo", -1, 1, "", methodObject),
    new Among("yo", -1, 1, "", methodObject),
    new Among("yas", -1, 1, "", methodObject),
    new Among("yes", -1, 1, "", methodObject),
    new Among("yais", -1, 1, "", methodObject),
    new Among("yamos", -1, 1, "", methodObject),
    new Among("y\u00F3", -1, 1, "", methodObject)
  };

  private static final Among a_8[] = {
    new Among("aba", -1, 2, "", methodObject),
    new Among("ada", -1, 2, "", methodObject),
    new Among("ida", -1, 2, "", methodObject),
    new Among("ara", -1, 2, "", methodObject),
    new Among("iera", -1, 2, "", methodObject),
    new Among("\u00EDa", -1, 2, "", methodObject),
    new Among("ar\u00EDa", 5, 2, "", methodObject),
    new Among("er\u00EDa", 5, 2, "", methodObject),
    new Among("ir\u00EDa", 5, 2, "", methodObject),
    new Among("ad", -1, 2, "", methodObject),
    new Among("ed", -1, 2, "", methodObject),
    new Among("id", -1, 2, "", methodObject),
    new Among("ase", -1, 2, "", methodObject),
    new Among("iese", -1, 2, "", methodObject),
    new Among("aste", -1, 2, "", methodObject),
    new Among("iste", -1, 2, "", methodObject),
    new Among("an", -1, 2, "", methodObject),
    new Among("aban", 16, 2, "", methodObject),
    new Among("aran", 16, 2, "", methodObject),
    new Among("ieran", 16, 2, "", methodObject),
    new Among("\u00EDan", 16, 2, "", methodObject),
    new Among("ar\u00EDan", 20, 2, "", methodObject),
    new Among("er\u00EDan", 20, 2, "", methodObject),
    new Among("ir\u00EDan", 20, 2, "", methodObject),
    new Among("en", -1, 1, "", methodObject),
    new Among("asen", 24, 2, "", methodObject),
    new Among("iesen", 24, 2, "", methodObject),
    new Among("aron", -1, 2, "", methodObject),
    new Among("ieron", -1, 2, "", methodObject),
    new Among("ar\u00E1n", -1, 2, "", methodObject),
    new Among("er\u00E1n", -1, 2, "", methodObject),
    new Among("ir\u00E1n", -1, 2, "", methodObject),
    new Among("ado", -1, 2, "", methodObject),
    new Among("ido", -1, 2, "", methodObject),
    new Among("ando", -1, 2, "", methodObject),
    new Among("iendo", -1, 2, "", methodObject),
    new Among("ar", -1, 2, "", methodObject),
    new Among("er", -1, 2, "", methodObject),
    new Among("ir", -1, 2, "", methodObject),
    new Among("as", -1, 2, "", methodObject),
    new Among("abas", 39, 2, "", methodObject),
    new Among("adas", 39, 2, "", methodObject),
    new Among("idas", 39, 2, "", methodObject),
    new Among("aras", 39, 2, "", methodObject),
    new Among("ieras", 39, 2, "", methodObject),
    new Among("\u00EDas", 39, 2, "", methodObject),
    new Among("ar\u00EDas", 45, 2, "", methodObject),
    new Among("er\u00EDas", 45, 2, "", methodObject),
    new Among("ir\u00EDas", 45, 2, "", methodObject),
    new Among("es", -1, 1, "", methodObject),
    new Among("ases", 49, 2, "", methodObject),
    new Among("ieses", 49, 2, "", methodObject),
    new Among("abais", -1, 2, "", methodObject),
    new Among("arais", -1, 2, "", methodObject),
    new Among("ierais", -1, 2, "", methodObject),
    new Among("\u00EDais", -1, 2, "", methodObject),
    new Among("ar\u00EDais", 55, 2, "", methodObject),
    new Among("er\u00EDais", 55, 2, "", methodObject),
    new Among("ir\u00EDais", 55, 2, "", methodObject),
    new Among("aseis", -1, 2, "", methodObject),
    new Among("ieseis", -1, 2, "", methodObject),
    new Among("asteis", -1, 2, "", methodObject),
    new Among("isteis", -1, 2, "", methodObject),
    new Among("\u00E1is", -1, 2, "", methodObject),
    new Among("\u00E9is", -1, 1, "", methodObject),
    new Among("ar\u00E9is", 64, 2, "", methodObject),
    new Among("er\u00E9is", 64, 2, "", methodObject),
    new Among("ir\u00E9is", 64, 2, "", methodObject),
    new Among("ados", -1, 2, "", methodObject),
    new Among("idos", -1, 2, "", methodObject),
    new Among("amos", -1, 2, "", methodObject),
    new Among("\u00E1bamos", 70, 2, "", methodObject),
    new Among("\u00E1ramos", 70, 2, "", methodObject),
    new Among("i\u00E9ramos", 70, 2, "", methodObject),
    new Among("\u00EDamos", 70, 2, "", methodObject),
    new Among("ar\u00EDamos", 74, 2, "", methodObject),
    new Among("er\u00EDamos", 74, 2, "", methodObject),
    new Among("ir\u00EDamos", 74, 2, "", methodObject),
    new Among("emos", -1, 1, "", methodObject),
    new Among("aremos", 78, 2, "", methodObject),
    new Among("eremos", 78, 2, "", methodObject),
    new Among("iremos", 78, 2, "", methodObject),
    new Among("\u00E1semos", 78, 2, "", methodObject),
    new Among("i\u00E9semos", 78, 2, "", methodObject),
    new Among("imos", -1, 2, "", methodObject),
    new Among("ar\u00E1s", -1, 2, "", methodObject),
    new Among("er\u00E1s", -1, 2, "", methodObject),
    new Among("ir\u00E1s", -1, 2, "", methodObject),
    new Among("\u00EDs", -1, 2, "", methodObject),
    new Among("ar\u00E1", -1, 2, "", methodObject),
    new Among("er\u00E1", -1, 2, "", methodObject),
    new Among("ir\u00E1", -1, 2, "", methodObject),
    new Among("ar\u00E9", -1, 2, "", methodObject),
    new Among("er\u00E9", -1, 2, "", methodObject),
    new Among("ir\u00E9", -1, 2, "", methodObject),
    new Among("i\u00F3", -1, 2, "", methodObject)
  };

  private static final Among a_9[] = {
    new Among("a", -1, 1, "", methodObject),
    new Among("e", -1, 2, "", methodObject),
    new Among("o", -1, 1, "", methodObject),
    new Among("os", -1, 1, "", methodObject),
    new Among("\u00E1", -1, 1, "", methodObject),
    new Among("\u00E9", -1, 2, "", methodObject),
    new Among("\u00ED", -1, 1, "", methodObject),
    new Among("\u00F3", -1, 1, "", methodObject)
  };

  private static final char g_v[] = {
    17, 65, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 17, 4, 10
  };

  private int I_p2;
  private int I_p1;
  private int I_pV;

  private void copy_from(SpanishStemmer other) {
    I_p2 = other.I_p2;
    I_p1 = other.I_p1;
    I_pV = other.I_pV;
    super.copy_from(other);
  }

  private boolean r_mark_regions() {
    int v_1;
    int v_2;
    int v_3;
    int v_6;
    int v_8;
    // (, line 31
    I_pV = limit;
    I_p1 = limit;
    I_p2 = limit;
    // do, line 37
    v_1 = cursor;
    lab0:
    do {
      // (, line 37
      // or, line 39
      lab1:
      do {
        v_2 = cursor;
        lab2:
        do {
          // (, line 38
          if (!(in_grouping(g_v, 97, 252))) {
            break lab2;
          }
          // or, line 38
          lab3:
          do {
            v_3 = cursor;
            lab4:
            do {
              // (, line 38
              if (!(out_grouping(g_v, 97, 252))) {
                break lab4;
              }
              // gopast, line 38
              golab5:
              while (true) {
                lab6:
                do {
                  if (!(in_grouping(g_v, 97, 252))) {
                    break lab6;
                  }
                  break golab5;
                } while (false);
                if (cursor >= limit) {
                  break lab4;
                }
                cursor++;
              }
              break lab3;
            } while (false);
            cursor = v_3;
            // (, line 38
            if (!(in_grouping(g_v, 97, 252))) {
              break lab2;
            }
            // gopast, line 38
            golab7:
            while (true) {
              lab8:
              do {
                if (!(out_grouping(g_v, 97, 252))) {
                  break lab8;
                }
                break golab7;
              } while (false);
              if (cursor >= limit) {
                break lab2;
              }
              cursor++;
            }
          } while (false);
          break lab1;
        } while (false);
        cursor = v_2;
        // (, line 40
        if (!(out_grouping(g_v, 97, 252))) {
          break lab0;
        }
        // or, line 40
        lab9:
        do {
          v_6 = cursor;
          lab10:
          do {
            // (, line 40
            if (!(out_grouping(g_v, 97, 252))) {
              break lab10;
            }
            // gopast, line 40
            golab11:
            while (true) {
              lab12:
              do {
                if (!(in_grouping(g_v, 97, 252))) {
                  break lab12;
                }
                break golab11;
              } while (false);
              if (cursor >= limit) {
                break lab10;
              }
              cursor++;
            }
            break lab9;
          } while (false);
          cursor = v_6;
          // (, line 40
          if (!(in_grouping(g_v, 97, 252))) {
            break lab0;
          }
          // next, line 40
          if (cursor >= limit) {
            break lab0;
          }
          cursor++;
        } while (false);
      } while (false);
      // setmark pV, line 41
      I_pV = cursor;
    } while (false);
    cursor = v_1;
    // do, line 43
    v_8 = cursor;
    lab13:
    do {
      // (, line 43
      // gopast, line 44
      golab14:
      while (true) {
        lab15:
        do {
          if (!(in_grouping(g_v, 97, 252))) {
            break lab15;
          }
          break golab14;
        } while (false);
        if (cursor >= limit) {
          break lab13;
        }
        cursor++;
      }
      // gopast, line 44
      golab16:
      while (true) {
        lab17:
        do {
          if (!(out_grouping(g_v, 97, 252))) {
            break lab17;
          }
          break golab16;
        } while (false);
        if (cursor >= limit) {
          break lab13;
        }
        cursor++;
      }
      // setmark p1, line 44
      I_p1 = cursor;
      // gopast, line 45
      golab18:
      while (true) {
        lab19:
        do {
          if (!(in_grouping(g_v, 97, 252))) {
            break lab19;
          }
          break golab18;
        } while (false);
        if (cursor >= limit) {
          break lab13;
        }
        cursor++;
      }
      // gopast, line 45
      golab20:
      while (true) {
        lab21:
        do {
          if (!(out_grouping(g_v, 97, 252))) {
            break lab21;
          }
          break golab20;
        } while (false);
        if (cursor >= limit) {
          break lab13;
        }
        cursor++;
      }
      // setmark p2, line 45
      I_p2 = cursor;
    } while (false);
    cursor = v_8;
    return true;
  }

  private boolean r_postlude() {
    int among_var;
    int v_1;
    // repeat, line 49
    replab0:
    while (true) {
      v_1 = cursor;
      lab1:
      do {
        // (, line 49
        // [, line 50
        bra = cursor;
        // substring, line 50
        among_var = find_among(a_0, 6);
        if (among_var == 0) {
          break lab1;
        }
        // ], line 50
        ket = cursor;
        switch (among_var) {
          case 0:
            break lab1;
          case 1:
            // (, line 51
            // <-, line 51
            slice_from("a");
            break;
          case 2:
            // (, line 52
            // <-, line 52
            slice_from("e");
            break;
          case 3:
            // (, line 53
            // <-, line 53
            slice_from("i");
            break;
          case 4:
            // (, line 54
            // <-, line 54
            slice_from("o");
            break;
          case 5:
            // (, line 55
            // <-, line 55
            slice_from("u");
            break;
          case 6:
            // (, line 57
            // next, line 57
            if (cursor >= limit) {
              break lab1;
            }
            cursor++;
            break;
        }
        continue replab0;
      } while (false);
      cursor = v_1;
      break replab0;
    }
    return true;
  }

  private boolean r_RV() {
    if (!(I_pV <= cursor)) {
      return false;
    }
    return true;
  }

  private boolean r_R1() {
    if (!(I_p1 <= cursor)) {
      return false;
    }
    return true;
  }

  private boolean r_R2() {
    if (!(I_p2 <= cursor)) {
      return false;
    }
    return true;
  }

  private boolean r_attached_pronoun() {
    int among_var;
    // (, line 67
    // [, line 68
    ket = cursor;
    // substring, line 68
    if (find_among_b(a_1, 13) == 0) {
      return false;
    }
    // ], line 68
    bra = cursor;
    // substring, line 72
    among_var = find_among_b(a_2, 11);
    if (among_var == 0) {
      return false;
    }
    // call RV, line 72
    if (!r_RV()) {
      return false;
    }
    switch (among_var) {
      case 0:
        return false;
      case 1:
        // (, line 73
        // ], line 73
        bra = cursor;
        // <-, line 73
        slice_from("iendo");
        break;
      case 2:
        // (, line 74
        // ], line 74
        bra = cursor;
        // <-, line 74
        slice_from("ando");
        break;
      case 3:
        // (, line 75
        // ], line 75
        bra = cursor;
        // <-, line 75
        slice_from("ar");
        break;
      case 4:
        // (, line 76
        // ], line 76
        bra = cursor;
        // <-, line 76
        slice_from("er");
        break;
      case 5:
        // (, line 77
        // ], line 77
        bra = cursor;
        // <-, line 77
        slice_from("ir");
        break;
      case 6:
        // (, line 81
        // delete, line 81
        slice_del();
        break;
      case 7:
        // (, line 82
        // literal, line 82
        if (!(eq_s_b(1, "u"))) {
          return false;
        }
        // delete, line 82
        slice_del();
        break;
    }
    return true;
  }

  private boolean r_standard_suffix() {
    int among_var;
    int v_1;
    int v_2;
    int v_3;
    int v_4;
    int v_5;
    // (, line 86
    // [, line 87
    ket = cursor;
    // substring, line 87
    among_var = find_among_b(a_6, 46);
    if (among_var == 0) {
      return false;
    }
    // ], line 87
    bra = cursor;
    switch (among_var) {
      case 0:
        return false;
      case 1:
        // (, line 98
        // call R2, line 99
        if (!r_R2()) {
          return false;
        }
        // delete, line 99
        slice_del();
        break;
      case 2:
        // (, line 104
        // call R2, line 105
        if (!r_R2()) {
          return false;
        }
        // delete, line 105
        slice_del();
        // try, line 106
        v_1 = limit - cursor;
        lab0:
        do {
          // (, line 106
          // [, line 106
          ket = cursor;
          // literal, line 106
          if (!(eq_s_b(2, "ic"))) {
            cursor = limit - v_1;
            break lab0;
          }
          // ], line 106
          bra = cursor;
          // call R2, line 106
          if (!r_R2()) {
            cursor = limit - v_1;
            break lab0;
          }
          // delete, line 106
          slice_del();
        } while (false);
        break;
      case 3:
        // (, line 110
        // call R2, line 111
        if (!r_R2()) {
          return false;
        }
        // <-, line 111
        slice_from("log");
        break;
      case 4:
        // (, line 114
        // call R2, line 115
        if (!r_R2()) {
          return false;
        }
        // <-, line 115
        slice_from("u");
        break;
      case 5:
        // (, line 118
        // call R2, line 119
        if (!r_R2()) {
          return false;
        }
        // <-, line 119
        slice_from("ente");
        break;
      case 6:
        // (, line 122
        // call R1, line 123
        if (!r_R1()) {
          return false;
        }
        // delete, line 123
        slice_del();
        // try, line 124
        v_2 = limit - cursor;
        lab1:
        do {
          // (, line 124
          // [, line 125
          ket = cursor;
          // substring, line 125
          among_var = find_among_b(a_3, 4);
          if (among_var == 0) {
            cursor = limit - v_2;
            break lab1;
          }
          // ], line 125
          bra = cursor;
          // call R2, line 125
          if (!r_R2()) {
            cursor = limit - v_2;
            break lab1;
          }
          // delete, line 125
          slice_del();
          switch (among_var) {
            case 0:
              cursor = limit - v_2;
              break lab1;
            case 1:
              // (, line 126
              // [, line 126
              ket = cursor;
              // literal, line 126
              if (!(eq_s_b(2, "at"))) {
                cursor = limit - v_2;
                break lab1;
              }
              // ], line 126
              bra = cursor;
              // call R2, line 126
              if (!r_R2()) {
                cursor = limit - v_2;
                break lab1;
              }
              // delete, line 126
              slice_del();
              break;
          }
        } while (false);
        break;
      case 7:
        // (, line 134
        // call R2, line 135
        if (!r_R2()) {
          return false;
        }
        // delete, line 135
        slice_del();
        // try, line 136
        v_3 = limit - cursor;
        lab2:
        do {
          // (, line 136
          // [, line 137
          ket = cursor;
          // substring, line 137
          among_var = find_among_b(a_4, 3);
          if (among_var == 0) {
            cursor = limit - v_3;
            break lab2;
          }
          // ], line 137
          bra = cursor;
          switch (among_var) {
            case 0:
              cursor = limit - v_3;
              break lab2;
            case 1:
              // (, line 140
              // call R2, line 140
              if (!r_R2()) {
                cursor = limit - v_3;
                break lab2;
              }
              // delete, line 140
              slice_del();
              break;
          }
        } while (false);
        break;
      case 8:
        // (, line 146
        // call R2, line 147
        if (!r_R2()) {
          return false;
        }
        // delete, line 147
        slice_del();
        // try, line 148
        v_4 = limit - cursor;
        lab3:
        do {
          // (, line 148
          // [, line 149
          ket = cursor;
          // substring, line 149
          among_var = find_among_b(a_5, 3);
          if (among_var == 0) {
            cursor = limit - v_4;
            break lab3;
          }
          // ], line 149
          bra = cursor;
          switch (among_var) {
            case 0:
              cursor = limit - v_4;
              break lab3;
            case 1:
              // (, line 152
              // call R2, line 152
              if (!r_R2()) {
                cursor = limit - v_4;
                break lab3;
              }
              // delete, line 152
              slice_del();
              break;
          }
        } while (false);
        break;
      case 9:
        // (, line 158
        // call R2, line 159
        if (!r_R2()) {
          return false;
        }
        // delete, line 159
        slice_del();
        // try, line 160
        v_5 = limit - cursor;
        lab4:
        do {
          // (, line 160
          // [, line 161
          ket = cursor;
          // literal, line 161
          if (!(eq_s_b(2, "at"))) {
            cursor = limit - v_5;
            break lab4;
          }
          // ], line 161
          bra = cursor;
          // call R2, line 161
          if (!r_R2()) {
            cursor = limit - v_5;
            break lab4;
          }
          // delete, line 161
          slice_del();
        } while (false);
        break;
    }
    return true;
  }

  private boolean r_y_verb_suffix() {
    int among_var;
    int v_1;
    int v_2;
    // (, line 167
    // setlimit, line 168
    v_1 = limit - cursor;
    // tomark, line 168
    if (cursor < I_pV) {
      return false;
    }
    cursor = I_pV;
    v_2 = limit_backward;
    limit_backward = cursor;
    cursor = limit - v_1;
    // (, line 168
    // [, line 168
    ket = cursor;
    // substring, line 168
    among_var = find_among_b(a_7, 12);
    if (among_var == 0) {
      limit_backward = v_2;
      return false;
    }
    // ], line 168
    bra = cursor;
    limit_backward = v_2;
    switch (among_var) {
      case 0:
        return false;
      case 1:
        // (, line 171
        // literal, line 171
        if (!(eq_s_b(1, "u"))) {
          return false;
        }
        // delete, line 171
        slice_del();
        break;
    }
    return true;
  }

  private boolean r_verb_suffix() {
    int among_var;
    int v_1;
    int v_2;
    int v_3;
    int v_4;
    // (, line 175
    // setlimit, line 176
    v_1 = limit - cursor;
    // tomark, line 176
    if (cursor < I_pV) {
      return false;
    }
    cursor = I_pV;
    v_2 = limit_backward;
    limit_backward = cursor;
    cursor = limit - v_1;
    // (, line 176
    // [, line 176
    ket = cursor;
    // substring, line 176
    among_var = find_among_b(a_8, 96);
    if (among_var == 0) {
      limit_backward = v_2;
      return false;
    }
    // ], line 176
    bra = cursor;
    limit_backward = v_2;
    switch (among_var) {
      case 0:
        return false;
      case 1:
        // (, line 179
        // try, line 179
        v_3 = limit - cursor;
        lab0:
        do {
          // (, line 179
          // literal, line 179
          if (!(eq_s_b(1, "u"))) {
            cursor = limit - v_3;
            break lab0;
          }
          // test, line 179
          v_4 = limit - cursor;
          // literal, line 179
          if (!(eq_s_b(1, "g"))) {
            cursor = limit - v_3;
            break lab0;
          }
          cursor = limit - v_4;
        } while (false);
        // ], line 179
        bra = cursor;
        // delete, line 179
        slice_del();
        break;
      case 2:
        // (, line 200
        // delete, line 200
        slice_del();
        break;
    }
    return true;
  }

  private boolean r_residual_suffix() {
    int among_var;
    int v_1;
    int v_2;
    // (, line 204
    // [, line 205
    ket = cursor;
    // substring, line 205
    among_var = find_among_b(a_9, 8);
    if (among_var == 0) {
      return false;
    }
    // ], line 205
    bra = cursor;
    switch (among_var) {
      case 0:
        return false;
      case 1:
        // (, line 208
        // call RV, line 208
        if (!r_RV()) {
          return false;
        }
        // delete, line 208
        slice_del();
        break;
      case 2:
        // (, line 210
        // call RV, line 210
        if (!r_RV()) {
          return false;
        }
        // delete, line 210
        slice_del();
        // try, line 210
        v_1 = limit - cursor;
        lab0:
        do {
          // (, line 210
          // [, line 210
          ket = cursor;
          // literal, line 210
          if (!(eq_s_b(1, "u"))) {
            cursor = limit - v_1;
            break lab0;
          }
          // ], line 210
          bra = cursor;
          // test, line 210
          v_2 = limit - cursor;
          // literal, line 210
          if (!(eq_s_b(1, "g"))) {
            cursor = limit - v_1;
            break lab0;
          }
          cursor = limit - v_2;
          // call RV, line 210
          if (!r_RV()) {
            cursor = limit - v_1;
            break lab0;
          }
          // delete, line 210
          slice_del();
        } while (false);
        break;
    }
    return true;
  }

  @Override
  public boolean stem() {
    int v_1;
    int v_2;
    int v_3;
    int v_4;
    int v_5;
    int v_6;
    // (, line 215
    // do, line 216
    v_1 = cursor;
    lab0:
    do {
      // call mark_regions, line 216
      if (!r_mark_regions()) {
        break lab0;
      }
    } while (false);
    cursor = v_1;
    // backwards, line 217
    limit_backward = cursor;
    cursor = limit;
    // (, line 217
    // do, line 218
    v_2 = limit - cursor;
    lab1:
    do {
      // call attached_pronoun, line 218
      if (!r_attached_pronoun()) {
        break lab1;
      }
    } while (false);
    cursor = limit - v_2;
    // do, line 219
    v_3 = limit - cursor;
    lab2:
    do {
      // (, line 219
      // or, line 219
      lab3:
      do {
        v_4 = limit - cursor;
        lab4:
        do {
          // call standard_suffix, line 219
          if (!r_standard_suffix()) {
            break lab4;
          }
          break lab3;
        } while (false);
        cursor = limit - v_4;
        lab5:
        do {
          // call y_verb_suffix, line 220
          if (!r_y_verb_suffix()) {
            break lab5;
          }
          break lab3;
        } while (false);
        cursor = limit - v_4;
        // call verb_suffix, line 221
        if (!r_verb_suffix()) {
          break lab2;
        }
      } while (false);
    } while (false);
    cursor = limit - v_3;
    // do, line 223
    v_5 = limit - cursor;
    lab6:
    do {
      // call residual_suffix, line 223
      if (!r_residual_suffix()) {
        break lab6;
      }
    } while (false);
    cursor = limit - v_5;
    cursor = limit_backward; // do, line 225
    v_6 = cursor;
    lab7:
    do {
      // call postlude, line 225
      if (!r_postlude()) {
        break lab7;
      }
    } while (false);
    cursor = v_6;
    return true;
  }

  @Override
  public boolean equals(Object o) {
    return o instanceof SpanishStemmer;
  }

  @Override
  public int hashCode() {
    return SpanishStemmer.class.getName().hashCode();
  }
}
