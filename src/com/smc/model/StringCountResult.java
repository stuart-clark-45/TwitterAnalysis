package com.smc.model;

import lombok.EqualsAndHashCode;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Indexed;

import com.smc.Analysis;

import lombok.Getter;

/**
 * Model used to represent the result of aggregations that count the number of occurrences of
 * {@code string}. See {@link Analysis}.
 *
 * @author Stuart Clark
 */
@EqualsAndHashCode(exclude = "count")
public abstract class StringCountResult {

  @Id
  @Getter
  private String string;

  @Getter
  @Indexed
  private long count;

}
