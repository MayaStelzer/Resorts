package com.maya.skiresorts.dao;

import com.maya.skiresorts.domain.Resort;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class ResortDAO {
    private final JdbcTemplate jdbcTemplate;
    public List<Resort> getResorts(){
        return jdbcTemplate.query("select * from resort;",
                (rs, rowNum) -> Resort.builder()
                        .resortId(rs.getInt("resort_id"))
                        .resortName(rs.getString("resort_name"))
                        .squareFootage(rs.getInt("resort_acreage"))
                        .verticalFeet(rs.getInt("resort_vertical_height"))
                        .numLifts(rs.getInt("num_lifts"))
                        .numRuns(rs.getInt("num_runs"))
                        .mapLink(rs.getString("resort_map"))
                                        .build());
    }
}
