package example.test.backend.data;

import java.util.List;

import org.apache.deltaspike.data.api.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository(forEntity = Asset.class)
public interface AssetRepository extends JpaRepository<Asset, Integer> {

	List<Asset> findByManufacturerStartsWithIgnoreCase(String manufacturer);

	@Override
	Asset findOne(Integer id);
}
