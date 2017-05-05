package com.nhb.common.predicate.numeric;

import com.nhb.common.predicate.object.ObjectDependence;
import com.nhb.common.predicate.value.NumberValue;

public class GreaterThan extends NumericComparisonPredicate {

	private static final long serialVersionUID = -3217505531609333605L;

	private NumberValue value;

	public GreaterThan(NumberValue value, NumberValue lowerBound) {
		super(lowerBound);
		this.value = value;
	}

	@Override
	public boolean apply(Object object) {
		if (this.value instanceof ObjectDependence) {
			((ObjectDependence) this.value).fill(object);
		}
		return getComparator().compare(this.value.get(), this.getAnchorValue().get()) > 0;
	}

	protected NumberValue getValue() {
		return this.value;
	}

	@Override
	public String toString() {
		return this.value.toString() + " >= " + this.getAnchorValue().toString();
	}
}
