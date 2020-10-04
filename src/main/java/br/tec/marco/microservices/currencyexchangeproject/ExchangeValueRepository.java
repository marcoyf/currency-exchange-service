/**
 * 
 */
package br.tec.marco.microservices.currencyexchangeproject;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author marcoyf
 *
 */
public interface ExchangeValueRepository 
		extends JpaRepository<ExchangeValue, Long>{

	ExchangeValue findByFromAndTo(String from, String to);
}
