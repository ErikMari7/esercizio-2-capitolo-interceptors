package co.develhope.esercizio2.interceptor.Repositories;

import co.develhope.esercizio2.interceptor.Entities.Month;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MonthRepository extends JpaRepository<Month,Long> {
    Month findByMonthNumber(int monthNumber);
}
