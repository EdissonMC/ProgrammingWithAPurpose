// Name        :
// Username    :
// Description :
public class AudioEffects
{
    // How many samples per second we assume the audio files are.
    // Use this constant for converting times in seconds to number of samples.
    public static final int SAMPLING_RATE = 44100;

    /**
     * Print out some useful statistics about the given audio buffer
     * @param  audio the audio samples
     */
    public static void audioStats(double [] audio)
    {
        // Compute average of the sample values
        double total = 0.0;
        double max = 0.0;
        
        // Calculate the average level and the maximum (absolute) level 
        for (int i = 0; i < audio.length; i++)
        {
            total += audio[i];
            double val = Math.abs(audio[i]);
            if (val > max)
            {
                max = val;
            }
        }              
        double avg = total / (audio.length);
        
        // Now find out the percent if sanokes <1% max level and <5% max level
        long below1 = 0;
        long below5 = 0;
        for (int i = 0; i < audio.length; i++)
        {
            double val = Math.abs(audio[i]);
            if (val < (0.05 * max))
            {
                below5++;
                if (val < (0.01 * max))
                    below1++;
            }                
        }               
    
        System.out.printf("Samples          : %12d\n", audio.length);
        System.out.printf("Length (s)       : %12.6f\n", ((double) audio.length / (double) SAMPLING_RATE));
        System.out.printf("Average level    : %12.6f\n", avg);
        System.out.printf("Max level        : %12.6f\n", max);              
        System.out.printf("Below 1%% max (%%) : %12.6f\n", ((double) below1 / (double) audio.length * 100.0));
        System.out.printf("Below 5%% max (%%) : %12.6f\n", ((double) below5 / (double) audio.length * 100.0)); 
    }
    
    /**
     * Change the volume level of all the audio in the passed in buffer
     * 
     * @param  audio  the audio samples
     * @param  gain   gain factor applied to each sample
     * @return        new buffer with samples at new gain level
     */   
    public static double [] audioGain(double [] audio, double gain)
    {
        double [] result = new double[audio.length];
        for (int i = 0; i < audio.length; i++)
            result[i] = audio[i] * gain;
        return result;
    }
    
    /**
     * Reverse the entire buffer
     * 
     * @param   audio  the audio samples
     * @return         buffer of the same size but in reverse order
     */
    public static double [] audioReverse(double [] audio)
    {
        // TBD
        return null;  
    }
    
    /**
     * Loop the given audio buffer a certain number of times
     * 
     * @param   audio  the audio samples
     * @param   loops  number of times to loop the samples
     * @return         buffer with the original audio repeated
     *                 returns null if loops <= 0
     */
    public static double [] audioLoop(double [] audio, int loops)
    {
        // TBD
        return null;  
    }
    
    /**
     * Merges two audio buffers together and return the resulting buffer.
     * Does a simple average of the samples from each audio buffer.
     * If buffers are different lengths, the result will be as long as the
     * shorter buffer
     *  
     * @param   audio1  first audio buffer
     * @param   audio2  second audio buffer
     * @return          resulting audio buffer, its length will be as long as
     *                  the shortest buffer sent in.
     */
    public static double [] audioMerge(double [] audio1, double [] audio2)
    {
        // TBD
        return null;  
    }

    /**
     * Cut the passed in audio buffer to only the audio between a start and
     * ending time.
     * 
     * @param   audio    the audio samples
     * @param   start    starting point in seconds
     * @param   end      ending point in seconds
     * @return           new clipped buffer
     *                   returns null if end <= start
     *                   returns null if start or end outside time range of audio
     *  
     */
    public static double [] audioCut(double [] audio, double start, double end)
    {
        // TBD
        return null;  
    }

    /**
     * Pad silence before and/or after an audio buffer
     * 
     * @param   audio   the audio samples
     * @params  before  seconds of silence to put before the audio
     * @params  after   seconds of silence to put after the audio
     * @return          resulting audio with the additional silence
     *                  returns null if before or after < 0.0
     */
    // TBD, audioPad method goes here
    
    /**
     * Echo the audio
     * 
     * @param   audio    the audio samples
     * @params  seconds  how many seconds in the past the echo is
     * @params  factor   how loud the echo is compared to original,
     *                   the new sample at time t is the current value at time t
     *                   plus the sample at time (t - seconds) * factor
     * @return           resulting audio samples with the echo
     *                   returns null if seconds < 0.0       
     */
    // TBD, audioEcho method goes here
    

    public static void main(String [] args)
    {    
        // Check for a valid number of parameters, otherwise print out the
        // command line options as a reminder.
        if (args.length < 2)
        {
            System.out.println("AudioEffects <infile> <effect> [options]");
            System.out.println();
            System.out.println("Effects:");
            System.out.println("  play                                - play the file");
            System.out.println("  stats                               - print some stats about the audio");            
            System.out.println("  reverse                 <out file>  - reverse an audio file ");
            System.out.println("  gain    <factor>        <out file>  - change the volume by given factor ");
            System.out.println("  loop    <times>         <out file>  - loop audio given number of times");
            System.out.println("  merge   <infile2>       <out file>  - merge two audio files together ");
            System.out.println("  cut     <start> <end>   <out file>  - clip audio from [start, end] seconds");
            System.out.println("  pad     <start> <end>   <out file>  - add silence to start and/or end");
            System.out.println("  echo    <secs> <factor> <out file>  - add an echo to audio");
            
            System.out.println();
            System.out.println("Supports only 44.1 kHz mono 16-bit signed WAV audio files.");
            return;
        }
    
        // Get the required command line options
        String inputFile  = args[0];
        String effect     = args[1].toLowerCase();
        String outputFile = "";
        
        // Obtain the samples from the input file
        double [] audio  = StdAudio.read(inputFile);
        double [] result = null;
        
        System.out.println("Effect: " + effect);
        
        if (effect.equals("play"))
        {
            StdAudio.play(audio);
        }
        else if (effect.equals("stats"))
        {
            audioStats(audio);
        }        
        else if (effect.equals("gain"))
        {
            if (args.length < 3)
            {
                System.out.println("gain effect expecting option <factor>");
                return;
            }
            double gain = Double.parseDouble(args[2]);
            outputFile = args[3];
            result = audioGain(audio, gain);
        }
        else if (effect.equals("reverse"))
        {
            outputFile = args[2];
            result = audioReverse(audio);
        }
        else if (effect.equals("loop"))
        {
            if (args.length < 3)
            {
                System.out.println("loop effect expecting option <times>");
                return;
            }                
            int loops = Integer.parseInt(args[2]);
            outputFile = args[3];
            result = audioLoop(audio, loops);
        }
        else if (effect.equals("merge"))
        {
            if (args.length < 4)
            {
                System.out.println("merge effect expecting option <infile2> <outfile>");
                return;
            }                        
            String inputFile2 = args[2];
            outputFile = args[3];
            double [] audio2 = StdAudio.read(inputFile2);
            result = audioMerge(audio, audio2);
        }
        else if (effect.equals("cut"))
        {
            if (args.length < 5)
            {
                System.out.println("cut effect expecting options <start> <end> <outfile>");
                return;
            }                                
            double start = Double.parseDouble(args[2]);
            double end   = Double.parseDouble(args[3]);
            outputFile   = args[4];
            
            result = audioCut(audio, start, end);   
        }
        else if (effect.equals("pad"))
        {
            if (args.length < 5)
            {
                System.out.println("pad effect expecting options <start> <end> <outfile>");
                return;
            }                                        
            double before = Double.parseDouble(args[2]);
            double after  = Double.parseDouble(args[3]);
            outputFile    = args[4];
            
            // TBD, call to audioPad   
        }
        else if (effect.equals("echo"))
        {
            if (args.length < 5)
            {
                System.out.println("echo effect expecting options <secs> <factor> <outfile>");
                return;
            }                                
        
            double seconds = Double.parseDouble(args[2]);
            double factor  = Double.parseDouble(args[3]);
            outputFile = args[4];
            // TBD, call to audioEcho   
        }
        else
        {
            System.out.println("Unknown effect: " + effect);
        }
        
        // Write the output file if we have a result buffer and an output name
        if ((result != null) && (outputFile.length() > 0))
        {
            StdAudio.save(outputFile, result);
            System.out.println("Wrote " + result.length + " samples to " + outputFile);
        }            
    }
}
