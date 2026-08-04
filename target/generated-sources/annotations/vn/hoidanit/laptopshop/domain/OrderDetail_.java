package vn.hoidanit.laptopshop.domain;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import vn.spring.laptopshop.domain.Order;
import vn.spring.laptopshop.domain.OrderDetail;
import vn.spring.laptopshop.domain.Product;

@StaticMetamodel(OrderDetail.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class OrderDetail_ {

	
	/**
	 * @see vn.spring.laptopshop.domain.OrderDetail#product
	 **/
	public static volatile SingularAttribute<OrderDetail, Product> product;
	
	/**
	 * @see vn.spring.laptopshop.domain.OrderDetail#quantity
	 **/
	public static volatile SingularAttribute<OrderDetail, Long> quantity;
	
	/**
	 * @see vn.spring.laptopshop.domain.OrderDetail#price
	 **/
	public static volatile SingularAttribute<OrderDetail, Double> price;
	
	/**
	 * @see vn.spring.laptopshop.domain.OrderDetail#id
	 **/
	public static volatile SingularAttribute<OrderDetail, Long> id;
	
	/**
	 * @see vn.spring.laptopshop.domain.OrderDetail
	 **/
	public static volatile EntityType<OrderDetail> class_;
	
	/**
	 * @see vn.spring.laptopshop.domain.OrderDetail#order
	 **/
	public static volatile SingularAttribute<OrderDetail, Order> order;

	public static final String PRODUCT = "product";
	public static final String QUANTITY = "quantity";
	public static final String PRICE = "price";
	public static final String ID = "id";
	public static final String ORDER = "order";

}

