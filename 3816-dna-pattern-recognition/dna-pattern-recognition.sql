# Write your MySQL query statement below

Select sample_id,dna_sequence,species,
    dna_sequence Like 'ATG%' as has_start,
    dna_sequence  REGEXP '(TAA|TAG|TGA)$' as has_stop,
    dna_sequence Like '%ATAT%' as has_atat,
    dna_sequence Like '%GGG%' as has_ggg
    from Samples;

 


    # Write your MySQL query statement below
-- select  sample_id, dna_sequence, species, 
--    (case when dna_sequence like "ATG%" then 1  else 0 end) as has_start,
--    (case when regexp_like (dna_sequence,"TAA$|TAG$|TGA$") then 1 else 0 end) as has_stop,
--    (case when dna_sequence like "%ATAT%" then 1 else 0 end) as has_atat,
--    (case when dna_sequence like "%GGG%" then 1 else 0 end) as has_ggg
-- from Samples
-- group by sample_id;
